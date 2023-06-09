package model;

/**
 * Wrapper class for the result of a hack action/event.
 * 
 * @author Andras Belicza
 */
public class HackDescription {
	
	/** Autogather/autotrain hack.      */
	public static final int HACK_TYPE_AUTOGATHER_AUTOTRAIN      =  0;
	/** Building selection hack.        */
	public static final int HACK_TYPE_BUILDING_SELECTION        =  1;
	/** Protoss moneyhack.              */
	public static final int HACK_TYPE_PROTOSS_MONEYHACK         =  2;
	/** Zerg moneyhack.                 */
	public static final int HACK_TYPE_ZERG_MONEYHACK            =  3;
	/** General money hack.             */
	public static final int HACK_TYPE_MONEYHACK                 =  4;
	/** Terran moneyhack.               */
	public static final int HACK_TYPE_TERRAN_MONEYHACK          =  5;
	/** Multicommand unit control hack. */
	public static final int HACK_TYPE_MULTICOMMAND_UNIT_CONTROL =  6;
	/** Multicommand rally set hack.    */
	public static final int HACK_TYPE_MULTICOMMAND_RALLY_SET    =  7;
	/** General multicommand hack.      */
	public static final int HACK_TYPE_MULTICOMMAND              =  8;
	/** Ally-vision drophack.           */
	public static final int HACK_TYPE_ALLY_VISION_DROPHACK      =  9;
	/** Build anywhere hack.            */
	public static final int HACK_TYPE_BUILD_ANYWHERE            = 10;
	/** Use cheat drophack.             */
	public static final int HACK_TYPE_USE_CHEAT_DROPHACK        = 11;
	/** Subunit enqueue hack.           */
	public static final int HACK_TYPE_SUBUNIT_ENQUEUE           = 12;
	/** Auto unit re-queue hack.        */
	public static final int HACK_TYPE_AUT0_UNIT_REQUEUE         = 13;
	/** Auto subunit re-queue hack.     */
	public static final int HACK_TYPE_AUT0_SUBUNIT_REQUEUE      = 14;
	
	/** Human readable names of the different types of hacks. */
	public static final String[] HACK_TYPE_NAMES = {
		"autogather/autotrain ",
		"building selection ",
		"protoss money",
		"zerg money",
		"money",
		"terran money",
		"multicommand unit control ",
		"multicommand rally set ",
		"multicommand ",
		"ally-vision drop",
		"build anywhere ",
		"use cheat drop",
		"subunit enqueue ",
		"auto unit re-queue ",
		"auto subunit re-queue "
	};
	
	/** Name of the player who was hacking.   */
	public final String playerName;
	/** Type of the hack.                     */
	public final int    hackType;
	/** Iteration when the hack was detected. */
	public final int    iteration;
	/** Description of the hack.              */
	public final String description;
	
	/**
	 * Creates a new HackDescription.
	 * @param playerName  name of the player who was hacking
	 * @param description description of the hack
	 */
	public HackDescription( final String playerName, final int hackType, final int iteration ) {
		this.playerName = playerName;
		this.hackType   = hackType;
		this.iteration  = iteration;
		
		this.description = playerName + " used " + HACK_TYPE_NAMES[ hackType ] + "hack at iteration " + iteration
			+ (hackType == HACK_TYPE_TERRAN_MONEYHACK ? " (this hack is reported only once)" : "" );
	}
	
}
