.class public Lcom/google/android/datatransport/cct/CctBackendFactory;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm1/d;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lm1/h;)Lm1/m;
    .locals 3

    new-instance v0, Lcom/google/android/datatransport/cct/d;

    invoke-virtual {p1}, Lm1/h;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lm1/h;->e()Lv1/a;

    move-result-object v2

    invoke-virtual {p1}, Lm1/h;->d()Lv1/a;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/datatransport/cct/d;-><init>(Landroid/content/Context;Lv1/a;Lv1/a;)V

    return-object v0
.end method
