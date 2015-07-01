package tb.common.itemblock;

import tb.common.block.BlockTBLeaves;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockTBLeaves extends ItemBlock{

	public ItemBlockTBLeaves(Block b) {
		super(b);
		this.setHasSubtypes(true);
	}
	
    public String getUnlocalizedName(ItemStack stk)
    {
    	return "tile."+BlockTBLeaves.names[stk.getItemDamage()];
    }
    
    public int getMetadata(int meta)
    {
        return meta;
    }

}