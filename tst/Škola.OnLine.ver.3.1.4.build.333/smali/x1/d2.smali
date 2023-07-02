.class public final synthetic Lx1/d2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lx1/e2;

.field public final synthetic o:Lg5/q$a;

.field public final synthetic p:Lz2/u$b;


# direct methods
.method public synthetic constructor <init>(Lx1/e2;Lg5/q$a;Lz2/u$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/d2;->n:Lx1/e2;

    iput-object p2, p0, Lx1/d2;->o:Lg5/q$a;

    iput-object p3, p0, Lx1/d2;->p:Lz2/u$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lx1/d2;->n:Lx1/e2;

    iget-object v1, p0, Lx1/d2;->o:Lg5/q$a;

    iget-object v2, p0, Lx1/d2;->p:Lz2/u$b;

    invoke-static {v0, v1, v2}, Lx1/e2;->a(Lx1/e2;Lg5/q$a;Lz2/u$b;)V

    return-void
.end method
