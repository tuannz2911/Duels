/*
 * This file is part of Duels, licensed under the MIT License.
 *
 * Copyright (c) Realized
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.realized.duels.api.kit;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import me.realized.duels.api.event.kit.KitCreateEvent;
import me.realized.duels.api.event.kit.KitRemoveEvent;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public interface KitManager {

    /**
     * @param name Name to search through the kits
     * @return Kit with the given name if exists, otherwise null
     */
    @Nullable
    Kit get(@Nonnull final String name);


    /**
     * Calls {@link KitCreateEvent} on successful creation.
     *
     * @param creator Player who is the creator of this kit
     * @param name Name of the kit
     * @return The newly created kit or null if a kit with given name already exists
     */
    @Nullable
    Kit create(@Nonnull final Player creator, @Nonnull final String name);


    /**
     * Calls {@link KitRemoveEvent} on successful removal.
     *
     * @param source CommandSender who is the source of this call
     * @param name Name of the kit to remove
     * @return The removed kit if removal was successful, otherwise null
     */
    @Nullable
    Kit remove(@Nullable CommandSender source, @Nonnull final String name);


    /**
     * Calls {@link #remove(CommandSender, String)} with source being null.
     *
     * @see #remove(CommandSender, String)
     */
    @Nullable
    Kit remove(@Nonnull final String name);
}