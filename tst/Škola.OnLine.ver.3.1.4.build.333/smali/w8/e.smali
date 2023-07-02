.class public final synthetic Lw8/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lw8/m;

.field public final synthetic o:Ljava/util/Map;

.field public final synthetic p:Ly4/j;


# direct methods
.method public synthetic constructor <init>(Lw8/m;Ljava/util/Map;Ly4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/e;->n:Lw8/m;

    iput-object p2, p0, Lw8/e;->o:Ljava/util/Map;

    iput-object p3, p0, Lw8/e;->p:Ly4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lw8/e;->n:Lw8/m;

    iget-object v1, p0, Lw8/e;->o:Ljava/util/Map;

    iget-object v2, p0, Lw8/e;->p:Ly4/j;

    invoke-static {v0, v1, v2}, Lw8/m;->e(Lw8/m;Ljava/util/Map;Ly4/j;)V

    return-void
.end method
