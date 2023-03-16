.class public final synthetic Lu2/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lu2/b0$a;

.field public final synthetic o:Lu2/b0;

.field public final synthetic p:Lu2/q;


# direct methods
.method public synthetic constructor <init>(Lu2/b0$a;Lu2/b0;Lu2/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/z;->n:Lu2/b0$a;

    iput-object p2, p0, Lu2/z;->o:Lu2/b0;

    iput-object p3, p0, Lu2/z;->p:Lu2/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lu2/z;->n:Lu2/b0$a;

    iget-object v1, p0, Lu2/z;->o:Lu2/b0;

    iget-object v2, p0, Lu2/z;->p:Lu2/q;

    invoke-static {v0, v1, v2}, Lu2/b0$a;->d(Lu2/b0$a;Lu2/b0;Lu2/q;)V

    return-void
.end method
