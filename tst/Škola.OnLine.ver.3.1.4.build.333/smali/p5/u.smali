.class public final synthetic Lp5/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ljava/util/Map$Entry;

.field public final synthetic o:Lk6/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Lk6/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/u;->n:Ljava/util/Map$Entry;

    iput-object p2, p0, Lp5/u;->o:Lk6/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp5/u;->n:Ljava/util/Map$Entry;

    iget-object v1, p0, Lp5/u;->o:Lk6/a;

    invoke-static {v0, v1}, Lp5/v;->e(Ljava/util/Map$Entry;Lk6/a;)V

    return-void
.end method
