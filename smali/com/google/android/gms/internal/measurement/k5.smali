.class public final Lcom/google/android/gms/internal/measurement/k5;
.super Lcom/google/android/gms/internal/measurement/i9;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pa;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/measurement/k5;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/measurement/n9;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/k5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/k5;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/k5;->zza:Lcom/google/android/gms/internal/measurement/k5;

    const-class v1, Lcom/google/android/gms/internal/measurement/k5;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/i9;->v(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/i9;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/i9;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/i9;->n()Lcom/google/android/gms/internal/measurement/n9;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->zzf:Lcom/google/android/gms/internal/measurement/n9;

    return-void
.end method

.method public static H()Lcom/google/android/gms/internal/measurement/j5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/k5;->zza:Lcom/google/android/gms/internal/measurement/k5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/i9;->z()Lcom/google/android/gms/internal/measurement/f9;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/j5;

    return-object v0
.end method

.method static synthetic I()Lcom/google/android/gms/internal/measurement/k5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/k5;->zza:Lcom/google/android/gms/internal/measurement/k5;

    return-object v0
.end method

.method static synthetic K(Lcom/google/android/gms/internal/measurement/k5;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/k5;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/k5;->zzd:I

    iput p1, p0, Lcom/google/android/gms/internal/measurement/k5;->zze:I

    return-void
.end method

.method static synthetic L(Lcom/google/android/gms/internal/measurement/k5;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->zzf:Lcom/google/android/gms/internal/measurement/n9;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/o9;->c()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/i9;->o(Lcom/google/android/gms/internal/measurement/n9;)Lcom/google/android/gms/internal/measurement/n9;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->zzf:Lcom/google/android/gms/internal/measurement/n9;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/k5;->zzf:Lcom/google/android/gms/internal/measurement/n9;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/measurement/q7;->b(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method protected final D(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    if-eq p1, p3, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/k5;->zza:Lcom/google/android/gms/internal/measurement/k5;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/j5;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/j5;-><init>(Lcom/google/android/gms/internal/measurement/j4;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/k5;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/k5;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zzd"

    aput-object v1, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v0

    sget-object p2, Lcom/google/android/gms/internal/measurement/k5;->zza:Lcom/google/android/gms/internal/measurement/k5;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/i9;->s(Lcom/google/android/gms/internal/measurement/oa;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final E()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->zzf:Lcom/google/android/gms/internal/measurement/n9;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final F()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/k5;->zze:I

    return v0
.end method

.method public final G(I)J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->zzf:Lcom/google/android/gms/internal/measurement/n9;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/measurement/n9;->a(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final J()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k5;->zzf:Lcom/google/android/gms/internal/measurement/n9;

    return-object v0
.end method

.method public final M()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/k5;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
