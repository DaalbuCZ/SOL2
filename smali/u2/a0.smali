.class public final synthetic Lu2/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lu2/b0$a;

.field public final synthetic o:Lu2/b0;

.field public final synthetic p:Lu2/u$b;

.field public final synthetic q:Lu2/q;


# direct methods
.method public synthetic constructor <init>(Lu2/b0$a;Lu2/b0;Lu2/u$b;Lu2/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/a0;->n:Lu2/b0$a;

    iput-object p2, p0, Lu2/a0;->o:Lu2/b0;

    iput-object p3, p0, Lu2/a0;->p:Lu2/u$b;

    iput-object p4, p0, Lu2/a0;->q:Lu2/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lu2/a0;->n:Lu2/b0$a;

    iget-object v1, p0, Lu2/a0;->o:Lu2/b0;

    iget-object v2, p0, Lu2/a0;->p:Lu2/u$b;

    iget-object v3, p0, Lu2/a0;->q:Lu2/q;

    invoke-static {v0, v1, v2, v3}, Lu2/b0$a;->a(Lu2/b0$a;Lu2/b0;Lu2/u$b;Lu2/q;)V

    return-void
.end method