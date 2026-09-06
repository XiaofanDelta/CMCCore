package nothing.xiaofan_delta.cmc;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Cmc.MODID)
public class Cmc {
	public static final String MODID = "cmc";
	public static final String NAME = "Create More Chunks";
	public static final Logger LOGGER = LogUtils.getLogger();

	// 工具方法：获取模组命名空间下的资源路径
	public static ResourceLocation loadResource(String path) {
		return ResourceLocation.fromNamespaceAndPath(MODID, path);
	}

}