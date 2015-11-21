package amidst.map.layer;

import amidst.Options;
import amidst.minecraft.world.finder.WorldObjectProducer;
import amidst.preferences.BooleanPrefModel;

public class StrongholdLayer extends IconLayer {
	@Override
	protected BooleanPrefModel getIsVisiblePreference() {
		return Options.instance.showStrongholds;
	}

	@Override
	protected WorldObjectProducer getProducer() {
		return Options.instance.world.getStrongholdProducer();
	}
}
