.class public final Lc2/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/n;


# instance fields
.field private final n:J

.field private final o:Lx1/n;


# direct methods
.method public constructor <init>(JLx1/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lc2/d;->n:J

    iput-object p3, p0, Lc2/d;->o:Lx1/n;

    return-void
.end method

.method static synthetic a(Lc2/d;)J
    .locals 2

    iget-wide v0, p0, Lc2/d;->n:J

    return-wide v0
.end method


# virtual methods
.method public e(II)Lx1/e0;
    .locals 1

    iget-object v0, p0, Lc2/d;->o:Lx1/n;

    invoke-interface {v0, p1, p2}, Lx1/n;->e(II)Lx1/e0;

    move-result-object p1

    return-object p1
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Lc2/d;->o:Lx1/n;

    invoke-interface {v0}, Lx1/n;->i()V

    return-void
.end method

.method public t(Lx1/b0;)V
    .locals 2

    iget-object v0, p0, Lc2/d;->o:Lx1/n;

    new-instance v1, Lc2/d$a;

    invoke-direct {v1, p0, p1}, Lc2/d$a;-><init>(Lc2/d;Lx1/b0;)V

    invoke-interface {v0, v1}, Lx1/n;->t(Lx1/b0;)V

    return-void
.end method
