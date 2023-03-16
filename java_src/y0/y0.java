package y0;

import android.view.View;
import android.widget.SeekBar;
/* loaded from: classes.dex */
public class y0 extends v1 {

    /* renamed from: q  reason: collision with root package name */
    private View f16780q;

    /* loaded from: classes.dex */
    private class a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final SeekBar.OnSeekBarChangeListener f16781a;

        public a(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
            this.f16781a = onSeekBarChangeListener;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            y0.this.c("OnProgressChanged in SeekBar with { id: " + seekBar.getId() + ", progress: " + seekBar.getProgress() + " }");
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f16781a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(seekBar, i10, z10);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f16781a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f16781a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }
        }
    }

    public y0(q1 q1Var, boolean z10, boolean z11) {
        super(q1Var, z10, z11);
    }

    @Override // y0.v1, y0.e1
    public void a() {
        ((SeekBar) this.f16780q).setOnSeekBarChangeListener(null);
        this.f16780q = null;
        super.a();
    }

    @Override // y0.e1
    public <T extends View> void b(T t10) {
        this.f16780q = t10;
        ((SeekBar) t10).setOnSeekBarChangeListener(new a(d0.d(t10)));
    }
}
