package dev.cshark.movemenow;

import net.craftminecraft.bungee.movemenow.MoveMeNow;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Hub extends Command {
    MoveMeNow plugin;
    Boolean require_perm;
    String lobbyName;
    String connecting_message;
    String connected_message;
    String already_connected_message;
    String hub_offline;
    String no_permission;

    public Hub(MoveMeNow plugin){
        super("Hub", "", plugin.getConfig().getStringList("aliases").toArray(new String[0]));
        this.plugin = plugin;

        lobbyName = plugin.getConfig().getString("servername");
        connecting_message = Utils.format(plugin.getConfig().getString("connecting_message"));
        connected_message = Utils.format(plugin.getConfig().getString("connected_message"));
        already_connected_message = Utils.format(plugin.getConfig().getString("already_connected_message"));
        hub_offline = Utils.format(plugin.getConfig().getString("hub_offline"));
        no_permission = Utils.format(plugin.getConfig().getString("no_permission"));

        require_perm = plugin.getConfig().getBoolean("require_perm");
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings) {
        if ((commandSender instanceof ProxiedPlayer)) {
            ProxiedPlayer p = (ProxiedPlayer) commandSender;
            if (p.hasPermission("hubutils.hub") || !require_perm) {
                ServerInfo target = ProxyServer.getInstance().getServerInfo(lobbyName);
                if (target == null) {
                    p.sendMessage(hub_offline);
                    return;
                }
                if (!p.getServer().getInfo().getName().equals(target.getName())) {
                    p.sendMessage(connecting_message);
                    p.connect(target);
                    p.sendMessage(connected_message);
                } else {
                    p.sendMessage(already_connected_message);
                }
            } else {
                p.sendMessage(no_permission);
            }
        } else {
            commandSender.sendMessage("&7[&6/hub utils&7] &4This command can only executed by a player!");
        }
    }
}
