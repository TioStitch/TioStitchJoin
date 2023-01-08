de.tiostitch.solarionsky.join;

public class Main extends JavaPlugin implements Listener {


  public void onEnable() {

   Bukkit.getConsoleSender().sendMessage("[Plugin] The plugin enabled sucess!");
   Bukkit.getPluginManager().registerEvents(this, this);

  }

  @EventHandler
  public void onJoin(PlayerJoinEvent e) {
   Player p = e.getPlayer();

   for (Player pall : Bukkit.getOnlinePlayers() {
      pall.sendMessage(p.getDisplayName() + " §eJoined in this server!")
       }
   }

  public void onDisable() {

   Bukkit.getConsoleSender().sendMessage("[Plugin] The plugin disabled sucess!");

  }
}













}