.class public final synthetic Lx1/s2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lx1/t2$a;

.field public final synthetic o:Landroid/util/Pair;

.field public final synthetic p:Lz2/n;

.field public final synthetic q:Lz2/q;

.field public final synthetic r:Ljava/io/IOException;

.field public final synthetic s:Z


# direct methods
.method public synthetic constructor <init>(Lx1/t2$a;Landroid/util/Pair;Lz2/n;Lz2/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/s2;->n:Lx1/t2$a;

    iput-object p2, p0, Lx1/s2;->o:Landroid/util/Pair;

    iput-object p3, p0, Lx1/s2;->p:Lz2/n;

    iput-object p4, p0, Lx1/s2;->q:Lz2/q;

    iput-object p5, p0, Lx1/s2;->r:Ljava/io/IOException;

    iput-boolean p6, p0, Lx1/s2;->s:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lx1/s2;->n:Lx1/t2$a;

    iget-object v1, p0, Lx1/s2;->o:Landroid/util/Pair;

    iget-object v2, p0, Lx1/s2;->p:Lz2/n;

    iget-object v3, p0, Lx1/s2;->q:Lz2/q;

    iget-object v4, p0, Lx1/s2;->r:Ljava/io/IOException;

    iget-boolean v5, p0, Lx1/s2;->s:Z

    invoke-static/range {v0 .. v5}, Lx1/t2$a;->A(Lx1/t2$a;Landroid/util/Pair;Lz2/n;Lz2/q;Ljava/io/IOException;Z)V

    return-void
.end method
