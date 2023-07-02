.class public Ld7/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ld7/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:Ljava/lang/String;

.field private final o:Lf7/l;

.field private p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld7/a$a;

    invoke-direct {v0}, Ld7/a$a;-><init>()V

    sput-object v0, Ld7/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld7/a;->p:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ld7/a;->n:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Ld7/a;->p:Z

    const-class v0, Lf7/l;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lf7/l;

    iput-object p1, p0, Ld7/a;->o:Lf7/l;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Ld7/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ld7/a;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lf7/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld7/a;->p:Z

    iput-object p1, p0, Ld7/a;->n:Ljava/lang/String;

    invoke-virtual {p2}, Lf7/a;->a()Lf7/l;

    move-result-object p1

    iput-object p1, p0, Ld7/a;->o:Lf7/l;

    return-void
.end method

.method public static b(Ljava/util/List;)[Lg7/k;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld7/a;",
            ">;)[",
            "Lg7/k;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lg7/k;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld7/a;

    invoke-virtual {v2}, Ld7/a;->a()Lg7/k;

    move-result-object v2

    const/4 v3, 0x1

    move v5, v1

    move v4, v3

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_2

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ld7/a;

    invoke-virtual {v6}, Ld7/a;->a()Lg7/k;

    move-result-object v6

    if-nez v5, :cond_1

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ld7/a;

    invoke-virtual {v7}, Ld7/a;->i()Z

    move-result v7

    if-eqz v7, :cond_1

    aput-object v6, v0, v1

    aput-object v2, v0, v4

    move v5, v3

    goto :goto_1

    :cond_1
    aput-object v6, v0, v4

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-nez v5, :cond_3

    aput-object v2, v0, v1

    :cond_3
    return-object v0
.end method

.method public static c()Ld7/a;
    .locals 3

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ld7/a;

    new-instance v2, Lf7/a;

    invoke-direct {v2}, Lf7/a;-><init>()V

    invoke-direct {v1, v0, v2}, Ld7/a;-><init>(Ljava/lang/String;Lf7/a;)V

    invoke-static {}, Ld7/a;->m()Z

    move-result v0

    invoke-virtual {v1, v0}, Ld7/a;->k(Z)V

    return-object v1
.end method

.method public static m()Z
    .locals 5

    invoke-static {}, Lcom/google/firebase/perf/config/a;->g()Lcom/google/firebase/perf/config/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/perf/config/a;->K()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v1

    invoke-virtual {v0}, Lcom/google/firebase/perf/config/a;->D()F

    move-result v0

    float-to-double v3, v0

    cmpg-double v0, v1, v3

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()Lg7/k;
    .locals 2

    invoke-static {}, Lg7/k;->Y()Lg7/k$c;

    move-result-object v0

    iget-object v1, p0, Ld7/a;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lg7/k$c;->M(Ljava/lang/String;)Lg7/k$c;

    move-result-object v0

    iget-boolean v1, p0, Ld7/a;->p:Z

    if-eqz v1, :cond_0

    sget-object v1, Lg7/l;->p:Lg7/l;

    invoke-virtual {v0, v1}, Lg7/k$c;->L(Lg7/l;)Lg7/k$c;

    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object v0

    check-cast v0, Lg7/k;

    return-object v0
.end method

.method public d()Lf7/l;
    .locals 1

    iget-object v0, p0, Ld7/a;->o:Lf7/l;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Z
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Ld7/a;->o:Lf7/l;

    invoke-virtual {v1}, Lf7/l;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    move-result-wide v0

    invoke-static {}, Lcom/google/firebase/perf/config/a;->g()Lcom/google/firebase/perf/config/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/perf/config/a;->A()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Ld7/a;->p:Z

    return v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Ld7/a;->p:Z

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ld7/a;->n:Ljava/lang/String;

    return-object v0
.end method

.method public k(Z)V
    .locals 0

    iput-boolean p1, p0, Ld7/a;->p:Z

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object p2, p0, Ld7/a;->n:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Ld7/a;->p:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-object p2, p0, Ld7/a;->o:Lf7/l;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
