.class public final synthetic Lu3/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lu3/y;

.field public final synthetic o:Lu3/y$c;


# direct methods
.method public synthetic constructor <init>(Lu3/y;Lu3/y$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/x;->n:Lu3/y;

    iput-object p2, p0, Lu3/x;->o:Lu3/y$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu3/x;->n:Lu3/y;

    iget-object v1, p0, Lu3/x;->o:Lu3/y$c;

    invoke-static {v0, v1}, Lu3/y;->a(Lu3/y;Lu3/y$c;)V

    return-void
.end method
