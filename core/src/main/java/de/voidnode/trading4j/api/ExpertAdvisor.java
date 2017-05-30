package de.voidnode.trading4j.api;

import de.voidnode.trading4j.domain.marketdata.CandleStick;
import de.voidnode.trading4j.domain.timeframe.M1;

/**
 * An algorithm that trades various assets based on market data.
 * 
 * @author Raik Bieniek
 *
 * @param <C>
 *            The type of {@link M1} {@link CandleStick}s that is required as input.
 */
public interface ExpertAdvisor<C extends CandleStick<?>> extends MarketDataListener<C> {

}
