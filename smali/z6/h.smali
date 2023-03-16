.class public final synthetic Lz6/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz6/k;

.field public final synthetic o:Lb7/h;

.field public final synthetic p:Lb7/d;


# direct methods
.method public synthetic constructor <init>(Lz6/k;Lb7/h;Lb7/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/h;->n:Lz6/k;

    iput-object p2, p0, Lz6/h;->o:Lb7/h;

    iput-object p3, p0, Lz6/h;->p:Lb7/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz6/h;->n:Lz6/k;

    iget-object v1, p0, Lz6/h;->o:Lb7/h;

    iget-object v2, p0, Lz6/h;->p:Lb7/d;

    invoke-static {v0, v1, v2}, Lz6/k;->e(Lz6/k;Lb7/h;Lb7/d;)V

    return-void
.end method
