.class public final Lx1/v1$g$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/v1$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:J

.field private b:J

.field private c:J

.field private d:F

.field private e:F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lx1/v1$g$a;->a:J

    iput-wide v0, p0, Lx1/v1$g$a;->b:J

    iput-wide v0, p0, Lx1/v1$g$a;->c:J

    const v0, -0x800001

    iput v0, p0, Lx1/v1$g$a;->d:F

    iput v0, p0, Lx1/v1$g$a;->e:F

    return-void
.end method

.method private constructor <init>(Lx1/v1$g;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-wide v0, p1, Lx1/v1$g;->n:J

    iput-wide v0, p0, Lx1/v1$g$a;->a:J

    iget-wide v0, p1, Lx1/v1$g;->o:J

    iput-wide v0, p0, Lx1/v1$g$a;->b:J

    iget-wide v0, p1, Lx1/v1$g;->p:J

    iput-wide v0, p0, Lx1/v1$g$a;->c:J

    iget v0, p1, Lx1/v1$g;->q:F

    iput v0, p0, Lx1/v1$g$a;->d:F

    iget p1, p1, Lx1/v1$g;->r:F

    iput p1, p0, Lx1/v1$g$a;->e:F

    return-void
.end method

.method synthetic constructor <init>(Lx1/v1$g;Lx1/v1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/v1$g$a;-><init>(Lx1/v1$g;)V

    return-void
.end method

.method static synthetic a(Lx1/v1$g$a;)J
    .locals 2

    iget-wide v0, p0, Lx1/v1$g$a;->a:J

    return-wide v0
.end method

.method static synthetic b(Lx1/v1$g$a;)J
    .locals 2

    iget-wide v0, p0, Lx1/v1$g$a;->b:J

    return-wide v0
.end method

.method static synthetic c(Lx1/v1$g$a;)J
    .locals 2

    iget-wide v0, p0, Lx1/v1$g$a;->c:J

    return-wide v0
.end method

.method static synthetic d(Lx1/v1$g$a;)F
    .locals 0

    iget p0, p0, Lx1/v1$g$a;->d:F

    return p0
.end method

.method static synthetic e(Lx1/v1$g$a;)F
    .locals 0

    iget p0, p0, Lx1/v1$g$a;->e:F

    return p0
.end method


# virtual methods
.method public f()Lx1/v1$g;
    .locals 2

    new-instance v0, Lx1/v1$g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lx1/v1$g;-><init>(Lx1/v1$g$a;Lx1/v1$a;)V

    return-object v0
.end method

.method public g(J)Lx1/v1$g$a;
    .locals 0

    iput-wide p1, p0, Lx1/v1$g$a;->c:J

    return-object p0
.end method

.method public h(F)Lx1/v1$g$a;
    .locals 0

    iput p1, p0, Lx1/v1$g$a;->e:F

    return-object p0
.end method

.method public i(J)Lx1/v1$g$a;
    .locals 0

    iput-wide p1, p0, Lx1/v1$g$a;->b:J

    return-object p0
.end method

.method public j(F)Lx1/v1$g$a;
    .locals 0

    iput p1, p0, Lx1/v1$g$a;->d:F

    return-object p0
.end method

.method public k(J)Lx1/v1$g$a;
    .locals 0

    iput-wide p1, p0, Lx1/v1$g$a;->a:J

    return-object p0
.end method
