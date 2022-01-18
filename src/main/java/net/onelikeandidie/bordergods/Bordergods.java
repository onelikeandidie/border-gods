package net.onelikeandidie.bordergods;

import net.fabricmc.api.ModInitializer;
import net.onelikeandidie.bordergods.listeners.DropInLavaListener;
import net.onelikeandidie.bordergods.listeners.TimeToMoveBorderListener;
import net.onelikeandidie.bordergods.util.ServerTimeLoop;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Bordergods implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("bordergods");
    @Override
    public void onInitialize() {
        LOGGER.info("Border Gods Mod Initializing...");
        var lavaListener = new DropInLavaListener();
        lavaListener.register();
        var borderListener = new TimeToMoveBorderListener();
        borderListener.register();
        ServerTimeLoop.init();
        LOGGER.info("Border Gods Mod Initialized!!!.");
    }
}
