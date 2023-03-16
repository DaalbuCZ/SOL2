package y0;

import android.annotation.TargetApi;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public class d0 {
    @TargetApi(14)
    public static CompoundButton.OnCheckedChangeListener a(View view) {
        String str;
        try {
            Field declaredField = Class.forName("android.widget.CompoundButton").getDeclaredField("mOnCheckedChangeListener");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return (CompoundButton.OnCheckedChangeListener) declaredField.get(view);
            }
        } catch (ClassNotFoundException unused) {
            str = "Class Not Found.";
            i0.d("Reflection", str);
            return null;
        } catch (IllegalAccessException unused2) {
            str = "Illegal Access.";
            i0.d("Reflection", str);
            return null;
        } catch (NoSuchFieldException unused3) {
            str = "No Such Field.";
            i0.d("Reflection", str);
            return null;
        }
        return null;
    }

    @TargetApi(14)
    public static View.OnClickListener b(View view) {
        String str;
        Object obj;
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                obj = declaredField.get(view);
            } else {
                obj = null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            if (declaredField2 == null || obj == null) {
                return null;
            }
            return (View.OnClickListener) declaredField2.get(obj);
        } catch (ClassNotFoundException unused) {
            str = "Class Not Found.";
            i0.d("Reflection", str);
            return null;
        } catch (IllegalAccessException unused2) {
            str = "Illegal Access.";
            i0.d("Reflection", str);
            return null;
        } catch (NoSuchFieldException unused3) {
            str = "No Such Field.";
            i0.d("Reflection", str);
            return null;
        }
    }

    @TargetApi(14)
    public static AdapterView.OnItemSelectedListener c(View view) {
        String str;
        try {
            Field declaredField = Class.forName("android.widget.AdapterView").getDeclaredField("mOnItemSelectedListener");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return (AdapterView.OnItemSelectedListener) declaredField.get(view);
            }
        } catch (ClassNotFoundException unused) {
            str = "Class Not Found.";
            i0.d("Reflection", str);
            return null;
        } catch (IllegalAccessException unused2) {
            str = "Illegal Access.";
            i0.d("Reflection", str);
            return null;
        } catch (NoSuchFieldException unused3) {
            str = "No Such Field.";
            i0.d("Reflection", str);
            return null;
        }
        return null;
    }

    @TargetApi(14)
    public static SeekBar.OnSeekBarChangeListener d(View view) {
        String str;
        try {
            Field declaredField = Class.forName("android.widget.SeekBar").getDeclaredField("mOnSeekBarChangeListener");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return (SeekBar.OnSeekBarChangeListener) declaredField.get(view);
            }
        } catch (ClassNotFoundException unused) {
            str = "Class Not Found.";
            i0.d("Reflection", str);
            return null;
        } catch (IllegalAccessException unused2) {
            str = "Illegal Access.";
            i0.d("Reflection", str);
            return null;
        } catch (NoSuchFieldException unused3) {
            str = "No Such Field.";
            i0.d("Reflection", str);
            return null;
        }
        return null;
    }
}
