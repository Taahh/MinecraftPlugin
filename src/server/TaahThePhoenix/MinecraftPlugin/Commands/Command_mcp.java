package server.TaahThePhoenix.MinecraftPlugin.Commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import server.TaahThePhoenix.MinecraftPlugin.MinecraftPlugin;
import static server.TaahThePhoenix.MinecraftPlugin.MinecraftPlugin.plugin;

public class Command_mcp implements CommandExecutor {
    private final MinecraftPlugin plugin;
    
    public Command_mcp(MinecraftPlugin plugin) {
        this.plugin = plugin;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
        sender.sendMessage(ChatColor.DARK_RED + "MinecraftPlugin version 1.0");
        sender.sendMessage(ChatColor.DARK_RED + "Compiled and built by TaahThePhoenix");
        sender.sendMessage(ChatColor.DARK_RED + "Running on: " + plugin.getConfig().getString("server.name"));
        return true;
    }
    
}
