<h1 align="center">
    <br>
    <a href=""><img src="https://github.com/Cshark1/HubUtils/blob/master/images/logo.png?raw=true" alt="HubUtils" width="400"></a>
    <br>
    HubUtils
    <br>
</h1>
<h4 align="center">/hub and <a href="https://www.spigotmc.org/resources/movemenow.17/">MoveMeNow</a> now in a single plugin!</h4>
<div align="center">
    <img alt="GitHub all releases" src="https://img.shields.io/github/downloads/Cshark1/HubUtils/total">
    <a href="https://github.com/Cshark1/HubUtils/blob/master/LICENSE"><img alt="GitHub license" src="https://img.shields.io/github/license/Cshark1/HubUtils"></a>
    <a href="https://github.com/Cshark1/HubUtils/stargazers"><img alt="GitHub stars" src="https://img.shields.io/github/stars/Cshark1/HubUtils"></a>
    <img alt="Discord" src="https://img.shields.io/discord/924121680564060240">
</div>
<p align="center">
    <a href="#features">Features</a> •
    <a href="#how-to-use">How To Use</a> •
    <a href="#build-instructions">Build Instructions</a> •
    <a href="#credits">Credits</a> 
</p>
<br>
<img alt="Demo video" src="https://github.com/Cshark1/HubUtils/blob/master/images/demo.gif?raw=true" width="100%">
<br>

## Features
* /hub command.
* Customizable aliases for the /hub command.
* Permission for the /hub command (can be disabled).
* Moving players to hub when they get kicked.
* Customizable blacklist / whitelist for the move on kick function.
* Customizable messages.

## How To Use
1. Stop the server.
2. Download and move the plugin to the BungeeCord plugin folder.
3. Start and stop the server.
4. Go to the plugins/HubUtils folder and edit the config.yml to your liking.

## Build Instructions
Make sure you have installed the following software: `java 8, maven, git`
```bash
  $ git clone https://github.com/Cshark1/HubUtils.git
  $ cd HubUtils
  $ mvn clean
  $ mvn package
```
The jar will be located in the HubUtils/target

## Credits
* <a href="https://github.com/roblabla">roblabla</a> for the work put in the <a href="https://www.spigotmc.org/resources/movemenow.17/">MoveMeNow</a> plugin.
* <a href="https://www.youtube.com/channel/UChefoHKtUB6ihSB9QAzGjhw">LoTooS</a> for the <a href="https://www.youtube.com/watch?v=FhnLOlTa-Rc">hub</a> used in the demo.