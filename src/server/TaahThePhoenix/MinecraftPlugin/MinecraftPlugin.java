package server.TaahThePhoenix.MinecraftPlugin;

import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;
import server.TaahThePhoenix.MinecraftPlugin.Commands.Command_mcp;

public class MinecraftPlugin extends JavaPlugin {
    public static MinecraftPlugin plugin;
        
    @Override
    public void onLoad(){
        plugin = this;
    }
    @Override
    public void onEnable(){
        this.register();
        getLogger().log(Level.INFO, "Made by TaahThePhoenix as a Test Plugin, version 1.0, enabled");
        
    }
    @Override
    public void onDisable(){
        getLogger().log(Level.INFO, "Made by TaahThePhoenix as a Test Plugin, version 1.0, disabled");
    }
    
    public void register(){
        this.getCommand("mcp").setExecutor(new Command_mcp(this));
        
    }
    
}
