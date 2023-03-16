package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.m0;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    private static final PorterDuff.Mode f909b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private static j f910c;

    /* renamed from: a  reason: collision with root package name */
    private m0 f911a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements m0.e {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f912a = {c.e.abc_textfield_search_default_mtrl_alpha, c.e.abc_textfield_default_mtrl_alpha, c.e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        private final int[] f913b = {c.e.abc_ic_commit_search_api_mtrl_alpha, c.e.abc_seekbar_tick_mark_material, c.e.abc_ic_menu_share_mtrl_alpha, c.e.abc_ic_menu_copy_mtrl_am_alpha, c.e.abc_ic_menu_cut_mtrl_alpha, c.e.abc_ic_menu_selectall_mtrl_alpha, c.e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        private final int[] f914c = {c.e.abc_textfield_activated_mtrl_alpha, c.e.abc_textfield_search_activated_mtrl_alpha, c.e.abc_cab_background_top_mtrl_alpha, c.e.abc_text_cursor_material, c.e.abc_text_select_handle_left_mtrl_dark, c.e.abc_text_select_handle_middle_mtrl_dark, c.e.abc_text_select_handle_right_mtrl_dark, c.e.abc_text_select_handle_left_mtrl_light, c.e.abc_text_select_handle_middle_mtrl_light, c.e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d  reason: collision with root package name */
        private final int[] f915d = {c.e.abc_popup_background_mtrl_mult, c.e.abc_cab_background_internal_bg, c.e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        private final int[] f916e = {c.e.abc_tab_indicator_material, c.e.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        private final int[] f917f = {c.e.abc_btn_check_material, c.e.abc_btn_radio_material, c.e.abc_btn_check_material_anim, c.e.abc_btn_radio_material_anim};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int c10 = r0.c(context, c.a.colorControlHighlight);
            return new ColorStateList(new int[][]{r0.f1004b, r0.f1007e, r0.f1005c, r0.f1011i}, new int[]{r0.b(context, c.a.colorButtonNormal), androidx.core.graphics.a.c(c10, i10), androidx.core.graphics.a.c(c10, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, r0.c(context, c.a.colorAccent));
        }

        private ColorStateList j(Context context) {
            return h(context, r0.c(context, c.a.colorButtonNormal));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i10 = c.a.colorSwitchThumbNormal;
            ColorStateList e10 = r0.e(context, i10);
            if (e10 == null || !e10.isStateful()) {
                iArr[0] = r0.f1004b;
                iArr2[0] = r0.b(context, i10);
                iArr[1] = r0.f1008f;
                iArr2[1] = r0.c(context, c.a.colorControlActivated);
                iArr[2] = r0.f1011i;
                iArr2[2] = r0.c(context, i10);
            } else {
                iArr[0] = r0.f1004b;
                iArr2[0] = e10.getColorForState(iArr[0], 0);
                iArr[1] = r0.f1008f;
                iArr2[1] = r0.c(context, c.a.colorControlActivated);
                iArr[2] = r0.f1011i;
                iArr2[2] = e10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private void l(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f909b;
            }
            drawable.setColorFilter(j.e(i10, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.m0.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.a()
                int[] r1 = r6.f912a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = c.a.colorControlNormal
            L14:
                r8 = r3
            L15:
                r1 = r5
                goto L44
            L17:
                int[] r1 = r6.f914c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = c.a.colorControlActivated
                goto L14
            L22:
                int[] r1 = r6.f915d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = c.e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = c.e.abc_dialog_material_background
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = r3
                r1 = r4
                r2 = r1
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.e0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.r0.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.m0.e
        public PorterDuff.Mode b(int i10) {
            if (i10 == c.e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.e
        public Drawable c(m0 m0Var, Context context, int i10) {
            if (i10 == c.e.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{m0Var.j(context, c.e.abc_cab_background_internal_bg), m0Var.j(context, c.e.abc_cab_background_top_mtrl_alpha)});
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.e
        public ColorStateList d(Context context, int i10) {
            if (i10 == c.e.abc_edit_text_material) {
                return e.a.c(context, c.c.abc_tint_edittext);
            }
            if (i10 == c.e.abc_switch_track_mtrl_alpha) {
                return e.a.c(context, c.c.abc_tint_switch_track);
            }
            if (i10 == c.e.abc_switch_thumb_material) {
                return k(context);
            }
            if (i10 == c.e.abc_btn_default_mtrl_shape) {
                return j(context);
            }
            if (i10 == c.e.abc_btn_borderless_material) {
                return g(context);
            }
            if (i10 == c.e.abc_btn_colored_material) {
                return i(context);
            }
            if (i10 == c.e.abc_spinner_mtrl_am_alpha || i10 == c.e.abc_spinner_textfield_background_material) {
                return e.a.c(context, c.c.abc_tint_spinner);
            }
            if (f(this.f913b, i10)) {
                return r0.e(context, c.a.colorControlNormal);
            }
            if (f(this.f916e, i10)) {
                return e.a.c(context, c.c.abc_tint_default);
            }
            if (f(this.f917f, i10)) {
                return e.a.c(context, c.c.abc_tint_btn_checkable);
            }
            if (i10 == c.e.abc_seekbar_thumb_material) {
                return e.a.c(context, c.c.abc_tint_seek_thumb);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.e
        public boolean e(Context context, int i10, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int c10;
            if (i10 == c.e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i11 = c.a.colorControlNormal;
                l(findDrawableByLayerId2, r0.c(context, i11), j.f909b);
                l(layerDrawable.findDrawableByLayerId(16908303), r0.c(context, i11), j.f909b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                c10 = r0.c(context, c.a.colorControlActivated);
            } else if (i10 != c.e.abc_ratingbar_material && i10 != c.e.abc_ratingbar_indicator_material && i10 != c.e.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                l(layerDrawable2.findDrawableByLayerId(16908288), r0.b(context, c.a.colorControlNormal), j.f909b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i12 = c.a.colorControlActivated;
                l(findDrawableByLayerId3, r0.c(context, i12), j.f909b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                c10 = r0.c(context, i12);
            }
            l(findDrawableByLayerId, c10, j.f909b);
            return true;
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (f910c == null) {
                h();
            }
            jVar = f910c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter l10;
        synchronized (j.class) {
            l10 = m0.l(i10, mode);
        }
        return l10;
    }

    public static synchronized void h() {
        synchronized (j.class) {
            if (f910c == null) {
                j jVar = new j();
                f910c = jVar;
                jVar.f911a = m0.h();
                f910c.f911a.u(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Drawable drawable, u0 u0Var, int[] iArr) {
        m0.w(drawable, u0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f911a.j(context, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f911a.k(context, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i10) {
        return this.f911a.m(context, i10);
    }

    public synchronized void g(Context context) {
        this.f911a.s(context);
    }
}
