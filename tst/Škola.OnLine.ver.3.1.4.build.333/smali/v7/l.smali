.class public final synthetic Lv7/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv7/m;

.field public final synthetic o:Lv7/k;


# direct methods
.method public synthetic constructor <init>(Lv7/m;Lv7/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/l;->n:Lv7/m;

    iput-object p2, p0, Lv7/l;->o:Lv7/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv7/l;->n:Lv7/m;

    iget-object v1, p0, Lv7/l;->o:Lv7/k;

    invoke-static {v0, v1}, Lv7/m;->a(Lv7/m;Lv7/k;)V

    return-void
.end method
