.class public final Lg4/a;
.super Lo4/a;
.source ""


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.service.IClientTelemetryService"

    invoke-direct {p0, p1, v0}, Lo4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final m0(Le4/s;)V
    .locals 1

    invoke-virtual {p0}, Lo4/a;->a()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lo4/c;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lo4/a;->f(ILandroid/os/Parcel;)V

    return-void
.end method
