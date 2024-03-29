package magincian.commands;

import magincian.main.OnaraTimeLimit;
import magincian.manager.ServerManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CurrentTimeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player))
        {
            commandSender.sendMessage("§cError");
            return true;
        }

        Player player = (Player) commandSender;

        commandSender.sendMessage(player.getUniqueId(),"current seconds: " + OnaraTimeLimit.currentSecondsPerPlayerID.get(player.getUniqueId())
        +"/"+ ServerManager.PERMITEDSECONDS);

        return true;
    }
}
