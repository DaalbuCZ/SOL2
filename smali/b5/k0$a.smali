.class Lb5/k0$a;
.super Lb5/s;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lb5/s<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field private final transient p:Lb5/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/r<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private final transient q:[Ljava/lang/Object;

.field private final transient r:I

.field private final transient s:I


# direct methods
.method constructor <init>(Lb5/r;[Ljava/lang/Object;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb5/r<",
            "TK;TV;>;[",
            "Ljava/lang/Object;",
            "II)V"
        }
    .end annotation

    invoke-direct {p0}, Lb5/s;-><init>()V

    iput-object p1, p0, Lb5/k0$a;->p:Lb5/r;

    iput-object p2, p0, Lb5/k0$a;->q:[Ljava/lang/Object;

    iput p3, p0, Lb5/k0$a;->r:I

    iput p4, p0, Lb5/k0$a;->s:I

    return-void
.end method

.method static synthetic M(Lb5/k0$a;)I
    .locals 0

    iget p0, p0, Lb5/k0$a;->s:I

    return p0
.end method

.method static synthetic N(Lb5/k0$a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lb5/k0$a;->q:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic O(Lb5/k0$a;)I
    .locals 0

    iget p0, p0, Lb5/k0$a;->r:I

    return p0
.end method


# virtual methods
.method F()Lb5/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb5/q<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lb5/k0$a$a;

    invoke-direct {v0, p0}, Lb5/k0$a$a;-><init>(Lb5/k0$a;)V

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lb5/k0$a;->p:Lb5/r;

    invoke-virtual {v2, v0}, Lb5/r;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method g([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lb5/s;->d()Lb5/q;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lb5/q;->g([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lb5/k0$a;->v()Lb5/s0;

    move-result-object v0

    return-object v0
.end method

.method s()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lb5/k0$a;->s:I

    return v0
.end method

.method public v()Lb5/s0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb5/s0<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lb5/s;->d()Lb5/q;

    move-result-object v0

    invoke-virtual {v0}, Lb5/q;->v()Lb5/s0;

    move-result-object v0

    return-object v0
.end method
