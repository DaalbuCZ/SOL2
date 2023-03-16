.class public final synthetic Lu2/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lu2/b0$a;

.field public final synthetic o:Lu2/b0;

.field public final synthetic p:Lu2/n;

.field public final synthetic q:Lu2/q;

.field public final synthetic r:Ljava/io/IOException;

.field public final synthetic s:Z


# direct methods
.method public synthetic constructor <init>(Lu2/b0$a;Lu2/b0;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/y;->n:Lu2/b0$a;

    iput-object p2, p0, Lu2/y;->o:Lu2/b0;

    iput-object p3, p0, Lu2/y;->p:Lu2/n;

    iput-object p4, p0, Lu2/y;->q:Lu2/q;

    iput-object p5, p0, Lu2/y;->r:Ljava/io/IOException;

    iput-boolean p6, p0, Lu2/y;->s:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lu2/y;->n:Lu2/b0$a;

    iget-object v1, p0, Lu2/y;->o:Lu2/b0;

    iget-object v2, p0, Lu2/y;->p:Lu2/n;

    iget-object v3, p0, Lu2/y;->q:Lu2/q;

    iget-object v4, p0, Lu2/y;->r:Ljava/io/IOException;

    iget-boolean v5, p0, Lu2/y;->s:Z

    invoke-static/range {v0 .. v5}, Lu2/b0$a;->b(Lu2/b0$a;Lu2/b0;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V

    return-void
.end method
