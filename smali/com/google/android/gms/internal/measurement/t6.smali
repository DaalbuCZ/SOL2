.class public final synthetic Lcom/google/android/gms/internal/measurement/t6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/k7;


# instance fields
.field public final synthetic n:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/t6;->n:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t6;->n:Landroid/content/Context;

    sget v1, Lcom/google/android/gms/internal/measurement/d7;->l:I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/p6;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/measurement/i7;

    move-result-object v0

    return-object v0
.end method
