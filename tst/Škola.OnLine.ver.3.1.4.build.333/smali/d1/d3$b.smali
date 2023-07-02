.class public final Ld1/d3$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld1/d3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/util/UUID;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:J

.field private g:Ld1/g0;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ld1/d3$a;)V
    .locals 0

    invoke-direct {p0}, Ld1/d3$b;-><init>()V

    return-void
.end method

.method static synthetic f(Ld1/d3$b;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Ld1/d3$b;->a:Ljava/util/UUID;

    return-object p0
.end method

.method static synthetic h(Ld1/d3$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ld1/d3$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic j(Ld1/d3$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ld1/d3$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic l(Ld1/d3$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ld1/d3$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic m(Ld1/d3$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ld1/d3$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic n(Ld1/d3$b;)J
    .locals 2

    iget-wide v0, p0, Ld1/d3$b;->f:J

    return-wide v0
.end method

.method static synthetic o(Ld1/d3$b;)Ld1/g0;
    .locals 0

    iget-object p0, p0, Ld1/d3$b;->g:Ld1/g0;

    return-object p0
.end method


# virtual methods
.method public a(J)Ld1/d3$b;
    .locals 0

    iput-wide p1, p0, Ld1/d3$b;->f:J

    return-object p0
.end method

.method public b(Ld1/g0;)Ld1/d3$b;
    .locals 0

    iput-object p1, p0, Ld1/d3$b;->g:Ld1/g0;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Ld1/d3$b;
    .locals 0

    iput-object p1, p0, Ld1/d3$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/util/UUID;)Ld1/d3$b;
    .locals 0

    iput-object p1, p0, Ld1/d3$b;->a:Ljava/util/UUID;

    return-object p0
.end method

.method public e()Ld1/d3;
    .locals 2

    new-instance v0, Ld1/d3;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ld1/d3;-><init>(Ld1/d3$b;Ld1/d3$a;)V

    return-object v0
.end method

.method public g(Ljava/lang/String;)Ld1/d3$b;
    .locals 0

    iput-object p1, p0, Ld1/d3$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public i(Ljava/lang/String;)Ld1/d3$b;
    .locals 0

    iput-object p1, p0, Ld1/d3$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public k(Ljava/lang/String;)Ld1/d3$b;
    .locals 0

    iput-object p1, p0, Ld1/d3$b;->b:Ljava/lang/String;

    return-object p0
.end method
