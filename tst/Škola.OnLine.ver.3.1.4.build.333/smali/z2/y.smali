.class public final synthetic Lz2/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz2/b0$a;

.field public final synthetic o:Lz2/b0;

.field public final synthetic p:Lz2/n;

.field public final synthetic q:Lz2/q;

.field public final synthetic r:Ljava/io/IOException;

.field public final synthetic s:Z


# direct methods
.method public synthetic constructor <init>(Lz2/b0$a;Lz2/b0;Lz2/n;Lz2/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/y;->n:Lz2/b0$a;

    iput-object p2, p0, Lz2/y;->o:Lz2/b0;

    iput-object p3, p0, Lz2/y;->p:Lz2/n;

    iput-object p4, p0, Lz2/y;->q:Lz2/q;

    iput-object p5, p0, Lz2/y;->r:Ljava/io/IOException;

    iput-boolean p6, p0, Lz2/y;->s:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lz2/y;->n:Lz2/b0$a;

    iget-object v1, p0, Lz2/y;->o:Lz2/b0;

    iget-object v2, p0, Lz2/y;->p:Lz2/n;

    iget-object v3, p0, Lz2/y;->q:Lz2/q;

    iget-object v4, p0, Lz2/y;->r:Ljava/io/IOException;

    iget-boolean v5, p0, Lz2/y;->s:Z

    invoke-static/range {v0 .. v5}, Lz2/b0$a;->b(Lz2/b0$a;Lz2/b0;Lz2/n;Lz2/q;Ljava/io/IOException;Z)V

    return-void
.end method
