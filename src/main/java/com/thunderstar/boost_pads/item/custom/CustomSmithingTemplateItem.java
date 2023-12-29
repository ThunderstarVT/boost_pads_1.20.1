package com.thunderstar.boost_pads.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CustomSmithingTemplateItem extends Item {
    public CustomSmithingTemplateItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.boost_pads.smithing_template_boost_pad_upgrade.tooltip0").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("tooltip.boost_pads.smithing_template_boost_pad_upgrade.tooltip1"));
        tooltip.add(Text.translatable("tooltip.boost_pads.smithing_template_boost_pad_upgrade.tooltip2").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("tooltip.boost_pads.smithing_template_boost_pad_upgrade.tooltip3").formatted(Formatting.BLUE));
        tooltip.add(Text.translatable("tooltip.boost_pads.smithing_template_boost_pad_upgrade.tooltip4").formatted(Formatting.GRAY));
        tooltip.add(Text.translatable("tooltip.boost_pads.smithing_template_boost_pad_upgrade.tooltip5").formatted(Formatting.BLUE));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
