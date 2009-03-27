package ca.uhn.hl7v2.model.v23.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v23.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the PPP_PCC_PROBLEM Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PRB (Problem Detail) <b></b><br>
 * 1: NTE (Notes and comments segment) <b>optional repeating</b><br>
 * 2: VAR (Variance) <b>optional repeating</b><br>
 * 3: PPP_PCC_PROBLEM_ROLE (a Group object) <b>optional repeating</b><br>
 * 4: PPP_PCC_PROBLEM_OBSERVATION (a Group object) <b>optional repeating</b><br>
 * 5: PPP_PCC_GOAL (a Group object) <b>optional repeating</b><br>
 * 6: PPP_PCC_ORDER (a Group object) <b>optional repeating</b><br>
 */
public class PPP_PCC_PROBLEM extends AbstractGroup {

	/** 
	 * Creates a new PPP_PCC_PROBLEM Group.
	 */
	public PPP_PCC_PROBLEM(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PRB.class, true, false);
	      this.add(NTE.class, false, true);
	      this.add(VAR.class, false, true);
	      this.add(PPP_PCC_PROBLEM_ROLE.class, false, true);
	      this.add(PPP_PCC_PROBLEM_OBSERVATION.class, false, true);
	      this.add(PPP_PCC_GOAL.class, false, true);
	      this.add(PPP_PCC_ORDER.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating PPP_PCC_PROBLEM - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns PRB (Problem Detail) - creates it if necessary
	 */
	public PRB getPRB() { 
	   PRB ret = null;
	   try {
	      ret = (PRB)this.get("PRB");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of NTE (Notes and comments segment) - creates it if necessary
	 */
	public NTE getNTE() { 
	   NTE ret = null;
	   try {
	      ret = (NTE)this.get("NTE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of NTE
	 * (Notes and comments segment) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public NTE getNTE(int rep) throws HL7Exception { 
	   return (NTE)this.get("NTE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of NTE 
	 */ 
	public int getNTEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("NTE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Returns  first repetition of VAR (Variance) - creates it if necessary
	 */
	public VAR getVAR() { 
	   VAR ret = null;
	   try {
	      ret = (VAR)this.get("VAR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of VAR
	 * (Variance) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public VAR getVAR(int rep) throws HL7Exception { 
	   return (VAR)this.get("VAR", rep);
	}

	/** 
	 * Returns the number of existing repetitions of VAR 
	 */ 
	public int getVARReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("VAR").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Returns  first repetition of PPP_PCC_PROBLEM_ROLE (a Group object) - creates it if necessary
	 */
	public PPP_PCC_PROBLEM_ROLE getPROBLEM_ROLE() { 
	   PPP_PCC_PROBLEM_ROLE ret = null;
	   try {
	      ret = (PPP_PCC_PROBLEM_ROLE)this.get("PROBLEM_ROLE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PPP_PCC_PROBLEM_ROLE
	 * (a Group object) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PPP_PCC_PROBLEM_ROLE getPROBLEM_ROLE(int rep) throws HL7Exception { 
	   return (PPP_PCC_PROBLEM_ROLE)this.get("PROBLEM_ROLE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PPP_PCC_PROBLEM_ROLE 
	 */ 
	public int getPROBLEM_ROLEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PROBLEM_ROLE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Returns  first repetition of PPP_PCC_PROBLEM_OBSERVATION (a Group object) - creates it if necessary
	 */
	public PPP_PCC_PROBLEM_OBSERVATION getPROBLEM_OBSERVATION() { 
	   PPP_PCC_PROBLEM_OBSERVATION ret = null;
	   try {
	      ret = (PPP_PCC_PROBLEM_OBSERVATION)this.get("PROBLEM_OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PPP_PCC_PROBLEM_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PPP_PCC_PROBLEM_OBSERVATION getPROBLEM_OBSERVATION(int rep) throws HL7Exception { 
	   return (PPP_PCC_PROBLEM_OBSERVATION)this.get("PROBLEM_OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PPP_PCC_PROBLEM_OBSERVATION 
	 */ 
	public int getPROBLEM_OBSERVATIONReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PROBLEM_OBSERVATION").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Returns  first repetition of PPP_PCC_GOAL (a Group object) - creates it if necessary
	 */
	public PPP_PCC_GOAL getGOAL() { 
	   PPP_PCC_GOAL ret = null;
	   try {
	      ret = (PPP_PCC_GOAL)this.get("GOAL");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PPP_PCC_GOAL
	 * (a Group object) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PPP_PCC_GOAL getGOAL(int rep) throws HL7Exception { 
	   return (PPP_PCC_GOAL)this.get("GOAL", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PPP_PCC_GOAL 
	 */ 
	public int getGOALReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("GOAL").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Returns  first repetition of PPP_PCC_ORDER (a Group object) - creates it if necessary
	 */
	public PPP_PCC_ORDER getORDER() { 
	   PPP_PCC_ORDER ret = null;
	   try {
	      ret = (PPP_PCC_ORDER)this.get("ORDER");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PPP_PCC_ORDER
	 * (a Group object) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PPP_PCC_ORDER getORDER(int rep) throws HL7Exception { 
	   return (PPP_PCC_ORDER)this.get("ORDER", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PPP_PCC_ORDER 
	 */ 
	public int getORDERReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ORDER").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

}
