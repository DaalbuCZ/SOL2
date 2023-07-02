.class final Lz2/p$a;
.super Lz2/l;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final v:Ljava/lang/Object;


# instance fields
.field private final t:Ljava/lang/Object;

.field private final u:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lz2/p$a;->v:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lx1/y3;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lz2/l;-><init>(Lx1/y3;)V

    iput-object p2, p0, Lz2/p$a;->t:Ljava/lang/Object;

    iput-object p3, p0, Lz2/p$a;->u:Ljava/lang/Object;

    return-void
.end method

.method static synthetic w(Lz2/p$a;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lz2/p$a;->u:Ljava/lang/Object;

    return-object p0
.end method

.method public static y(Lx1/v1;)Lz2/p$a;
    .locals 3

    new-instance v0, Lz2/p$a;

    new-instance v1, Lz2/p$b;

    invoke-direct {v1, p0}, Lz2/p$b;-><init>(Lx1/v1;)V

    sget-object p0, Lx1/y3$d;->E:Ljava/lang/Object;

    sget-object v2, Lz2/p$a;->v:Ljava/lang/Object;

    invoke-direct {v0, v1, p0, v2}, Lz2/p$a;-><init>(Lx1/y3;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static z(Lx1/y3;Ljava/lang/Object;Ljava/lang/Object;)Lz2/p$a;
    .locals 1

    new-instance v0, Lz2/p$a;

    invoke-direct {v0, p0, p1, p2}, Lz2/p$a;-><init>(Lx1/y3;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public f(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lz2/l;->s:Lx1/y3;

    sget-object v1, Lz2/p$a;->v:Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lz2/p$a;->u:Ljava/lang/Object;

    if-eqz v1, :cond_0

    move-object p1, v1

    :cond_0
    invoke-virtual {v0, p1}, Lx1/y3;->f(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public k(ILx1/y3$b;Z)Lx1/y3$b;
    .locals 1

    iget-object v0, p0, Lz2/l;->s:Lx1/y3;

    invoke-virtual {v0, p1, p2, p3}, Lx1/y3;->k(ILx1/y3$b;Z)Lx1/y3$b;

    iget-object p1, p2, Lx1/y3$b;->o:Ljava/lang/Object;

    iget-object v0, p0, Lz2/p$a;->u:Ljava/lang/Object;

    invoke-static {p1, v0}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    sget-object p1, Lz2/p$a;->v:Ljava/lang/Object;

    iput-object p1, p2, Lx1/y3$b;->o:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public q(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz2/l;->s:Lx1/y3;

    invoke-virtual {v0, p1}, Lx1/y3;->q(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lz2/p$a;->u:Ljava/lang/Object;

    invoke-static {p1, v0}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lz2/p$a;->v:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public s(ILx1/y3$d;J)Lx1/y3$d;
    .locals 1

    iget-object v0, p0, Lz2/l;->s:Lx1/y3;

    invoke-virtual {v0, p1, p2, p3, p4}, Lx1/y3;->s(ILx1/y3$d;J)Lx1/y3$d;

    iget-object p1, p2, Lx1/y3$d;->n:Ljava/lang/Object;

    iget-object p3, p0, Lz2/p$a;->t:Ljava/lang/Object;

    invoke-static {p1, p3}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lx1/y3$d;->E:Ljava/lang/Object;

    iput-object p1, p2, Lx1/y3$d;->n:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public x(Lx1/y3;)Lz2/p$a;
    .locals 3

    new-instance v0, Lz2/p$a;

    iget-object v1, p0, Lz2/p$a;->t:Ljava/lang/Object;

    iget-object v2, p0, Lz2/p$a;->u:Ljava/lang/Object;

    invoke-direct {v0, p1, v1, v2}, Lz2/p$a;-><init>(Lx1/y3;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
