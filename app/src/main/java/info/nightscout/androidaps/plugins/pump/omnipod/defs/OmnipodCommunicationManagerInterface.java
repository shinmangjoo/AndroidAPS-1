package info.nightscout.androidaps.plugins.pump.omnipod.defs;

import info.nightscout.androidaps.data.Profile;
import info.nightscout.androidaps.data.PumpEnactResult;
import info.nightscout.androidaps.plugins.pump.common.data.TempBasalPair;

public interface OmnipodCommunicationManagerInterface {

    /**
     * Pair and prime
     */
    PumpEnactResult pairAndPrime();

    /**
     * Insert cannula
     */
    PumpEnactResult insertCannula(Profile basalProfile);

    /**
     * Get Pod Status (is pod running, battery left ?, reservoir, etc)
     */
    // TODO we should probably return a (wrapped) StatusResponse instead of a PumpEnactResult
    PumpEnactResult getPodStatus();

    /**
     * Deactivate Pod
     */
    PumpEnactResult deactivatePod();

    /**
     * Set Basal Profile
     */
    PumpEnactResult setBasalProfile(Profile basalProfile);

    /**
     * Reset Pod state (if we forget to disconnect Pod and want to init new pod, and want to forget current pod)
     */
    PumpEnactResult resetPodState();

    /**
     * Set Bolus
     *
     * @param amount amount of bolus in U
     */
    PumpEnactResult bolus(Double amount);

    /**
     * Cancel Bolus (if bolus is already stopped, return acknowledgment)
     */
    PumpEnactResult cancelBolus();

    /**
     * Set Temporary Basal
     *
     * @param tempBasalPair TempBasalPair object containg amount and duration in minutes
     */
    PumpEnactResult setTemporaryBasal(TempBasalPair tempBasalPair);

    /**
     * Cancel Temporary Basal (if TB is already stopped, return acknowledgment)
     */
    PumpEnactResult cancelTemporaryBasal();

    /**
     * Acknowledge alerts
     */
    PumpEnactResult acknowledgeAlerts();


}
