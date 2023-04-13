package com.teampotato.thereisnothinglefttobeafraidof;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ThereIsNothingLeftToBeAfraidOf.ID)
public class ThereIsNothingLeftToBeAfraidOf {
    public static final String ID = "thereisnothinglefttobeafraidof";
    public static final Logger LOGGER = LogManager.getLogger(ID);

    public ThereIsNothingLeftToBeAfraidOf() {
        LOGGER.info("There is nothing left to be afraid of.");
        LOGGER.info("Because I'm not alone anymore!");
    }
}
