package Operator;

import ExtinguishDevices.FrontCannon;
import ExtinguishDevices.FrontWaterStepsType;

public class KnobFrontWaterCanon{

    private FrontCannon canon;

    KnobFrontWaterCanon(FrontCannon frontCannon) {
            this.canon = frontCannon;
    }

    public void changeStep(FrontWaterStepsType step) {
        this.canon.setSteps(step);
    }
}
