.class public Lz3/f;
.super La4/a;
.source ""


# static fields
.field static final B:[Lcom/google/android/gms/common/api/Scope;

.field static final C:[Lw3/d;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz3/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private A:Ljava/lang/String;

.field final n:I

.field final o:I

.field p:I

.field q:Ljava/lang/String;

.field r:Landroid/os/IBinder;

.field s:[Lcom/google/android/gms/common/api/Scope;

.field t:Landroid/os/Bundle;

.field u:Landroid/accounts/Account;

.field v:[Lw3/d;

.field w:[Lw3/d;

.field x:Z

.field y:I

.field z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz3/e1;

    invoke-direct {v0}, Lz3/e1;-><init>()V

    sput-object v0, Lz3/f;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/google/android/gms/common/api/Scope;

    sput-object v1, Lz3/f;->B:[Lcom/google/android/gms/common/api/Scope;

    new-array v0, v0, [Lw3/d;

    sput-object v0, Lz3/f;->C:[Lw3/d;

    return-void
.end method

.method constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lw3/d;[Lw3/d;ZIZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, La4/a;-><init>()V

    if-nez p6, :cond_0

    sget-object p6, Lz3/f;->B:[Lcom/google/android/gms/common/api/Scope;

    :cond_0
    if-nez p7, :cond_1

    new-instance p7, Landroid/os/Bundle;

    invoke-direct {p7}, Landroid/os/Bundle;-><init>()V

    :cond_1
    if-nez p9, :cond_2

    sget-object p9, Lz3/f;->C:[Lw3/d;

    :cond_2
    if-nez p10, :cond_3

    sget-object p10, Lz3/f;->C:[Lw3/d;

    :cond_3
    iput p1, p0, Lz3/f;->n:I

    iput p2, p0, Lz3/f;->o:I

    iput p3, p0, Lz3/f;->p:I

    const-string p2, "com.google.android.gms"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    iput-object p2, p0, Lz3/f;->q:Ljava/lang/String;

    goto :goto_0

    :cond_4
    iput-object p4, p0, Lz3/f;->q:Ljava/lang/String;

    :goto_0
    const/4 p2, 0x2

    if-ge p1, p2, :cond_6

    if-eqz p5, :cond_5

    invoke-static {p5}, Lz3/i$a;->e(Landroid/os/IBinder;)Lz3/i;

    move-result-object p1

    invoke-static {p1}, Lz3/a;->f(Lz3/i;)Landroid/accounts/Account;

    move-result-object p1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Lz3/f;->u:Landroid/accounts/Account;

    goto :goto_2

    :cond_6
    iput-object p5, p0, Lz3/f;->r:Landroid/os/IBinder;

    iput-object p8, p0, Lz3/f;->u:Landroid/accounts/Account;

    :goto_2
    iput-object p6, p0, Lz3/f;->s:[Lcom/google/android/gms/common/api/Scope;

    iput-object p7, p0, Lz3/f;->t:Landroid/os/Bundle;

    iput-object p9, p0, Lz3/f;->v:[Lw3/d;

    iput-object p10, p0, Lz3/f;->w:[Lw3/d;

    iput-boolean p11, p0, Lz3/f;->x:Z

    iput p12, p0, Lz3/f;->y:I

    iput-boolean p13, p0, Lz3/f;->z:Z

    iput-object p14, p0, Lz3/f;->A:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz3/f;->A:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lz3/e1;->a(Lz3/f;Landroid/os/Parcel;I)V

    return-void
.end method
