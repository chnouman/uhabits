/*
 * Copyright (C) 2017 Álinson Santos Xavier <isoron@gmail.com>
 *
 * This file is part of Loop Habit Tracker.
 *
 * Loop Habit Tracker is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Loop Habit Tracker is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.isoron.uhabits.activities;

import android.support.annotation.*;

import org.isoron.androidbase.*;
import org.isoron.uhabits.core.ui.screens.habits.list.*;
import org.isoron.uhabits.core.ui.screens.habits.show.*;

import java.io.*;

import javax.inject.*;

public class HabitsDirFinder
    implements ShowHabitMenuBehavior.System, ListHabitsBehavior.DirFinder
{
    private AndroidDirFinder androidDirFinder;

    @Inject
    public HabitsDirFinder(@NonNull AndroidDirFinder androidDirFinder)
    {
        this.androidDirFinder = androidDirFinder;
    }

    @Override
    public File getCSVOutputDir()
    {
        return androidDirFinder.getFilesDir("CSV");
    }
}
