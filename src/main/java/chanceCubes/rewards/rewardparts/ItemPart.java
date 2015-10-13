package chanceCubes.rewards.rewardparts;

import net.minecraft.item.ItemStack;

public class ItemPart
{
	private ItemStack stack;

	private int delay = 0;

	public ItemPart(ItemStack stack)
	{
		this.stack = stack;
	}

	public ItemStack getItemStack()
	{
		return stack;
	}

	public int getDelay()
	{
		return delay;
	}

	public ItemPart setDelay(int delay)
	{
		this.delay = delay;
		return this;
	}
}