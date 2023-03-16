.class public final Lw3/a0;
.super La4/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw3/a0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:Ljava/lang/String;

.field private final o:Z

.field private final p:Z

.field private final q:Landroid/content/Context;

.field private final r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw3/b0;

    invoke-direct {v0}, Lw3/b0;-><init>()V

    sput-object v0, Lw3/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;ZZLandroid/os/IBinder;Z)V
    .locals 0

    invoke-direct {p0}, La4/a;-><init>()V

    iput-object p1, p0, Lw3/a0;->n:Ljava/lang/String;

    iput-boolean p2, p0, Lw3/a0;->o:Z

    iput-boolean p3, p0, Lw3/a0;->p:Z

    invoke-static {p4}, Lg4/a$a;->e(Landroid/os/IBinder;)Lg4/a;

    move-result-object p1

    invoke-static {p1}, Lg4/b;->f(Lg4/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lw3/a0;->q:Landroid/content/Context;

    iput-boolean p5, p0, Lw3/a0;->r:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, La4/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lw3/a0;->n:Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, La4/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-boolean v0, p0, Lw3/a0;->o:Z

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, La4/c;->c(Landroid/os/Parcel;IZ)V

    iget-boolean v0, p0, Lw3/a0;->p:Z

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, La4/c;->c(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lw3/a0;->q:Landroid/content/Context;

    invoke-static {v0}, Lg4/b;->m0(Ljava/lang/Object;)Lg4/a;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0, v2}, La4/c;->h(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-boolean v0, p0, Lw3/a0;->r:Z

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, La4/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, La4/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
