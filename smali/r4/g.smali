.class public final Lr4/g;
.super Lj4/a;
.source ""


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    invoke-direct {p0, p1, v0}, Lj4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final m0(Lr4/j;Lr4/f;)V
    .locals 1

    invoke-virtual {p0}, Lj4/a;->a()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lj4/c;->b(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Lj4/c;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v0}, Lj4/a;->e(ILandroid/os/Parcel;)V

    return-void
.end method
