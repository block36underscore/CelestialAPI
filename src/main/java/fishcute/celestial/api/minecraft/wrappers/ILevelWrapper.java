package fishcute.celestial.api.minecraft.wrappers;

import fishcute.celestial.api.minecraft.IMcVector;

public interface ILevelWrapper {
     IMcVector getSkyColor(float tickDelta);

     float[] getSunriseColor(float tickDelta);

     float getTimeOfDay(float tickDelta);
     float getSunAngle(float tickDelta);
     double getHorizonHeight();
     boolean hasGround();
}
