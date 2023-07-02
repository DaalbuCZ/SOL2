.class public final synthetic Lx1/i2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lx1/t2$a;

.field public final synthetic o:Landroid/util/Pair;

.field public final synthetic p:Lz2/q;


# direct methods
.method public synthetic constructor <init>(Lx1/t2$a;Landroid/util/Pair;Lz2/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/i2;->n:Lx1/t2$a;

    iput-object p2, p0, Lx1/i2;->o:Landroid/util/Pair;

    iput-object p3, p0, Lx1/i2;->p:Lz2/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lx1/i2;->n:Lx1/t2$a;

    iget-object v1, p0, Lx1/i2;->o:Landroid/util/Pair;

    iget-object v2, p0, Lx1/i2;->p:Lz2/q;

    invoke-static {v0, v1, v2}, Lx1/t2$a;->b(Lx1/t2$a;Landroid/util/Pair;Lz2/q;)V

    return-void
.end method
