.class public final Lcom/google/android/gms/internal/measurement/xc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/k7;


# static fields
.field private static final o:Lcom/google/android/gms/internal/measurement/xc;


# instance fields
.field private final n:Lcom/google/android/gms/internal/measurement/k7;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/xc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/xc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/xc;->o:Lcom/google/android/gms/internal/measurement/xc;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zc;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/o7;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/k7;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/o7;->a(Lcom/google/android/gms/internal/measurement/k7;)Lcom/google/android/gms/internal/measurement/k7;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/xc;->n:Lcom/google/android/gms/internal/measurement/k7;

    return-void
.end method

.method public static c()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/xc;->o:Lcom/google/android/gms/internal/measurement/xc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/xc;->b()Lcom/google/android/gms/internal/measurement/yc;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/yc;->a()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static d()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/xc;->o:Lcom/google/android/gms/internal/measurement/xc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/xc;->b()Lcom/google/android/gms/internal/measurement/yc;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/yc;->b()Z

    move-result v0

    return v0
.end method

.method public static e()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/xc;->o:Lcom/google/android/gms/internal/measurement/xc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/xc;->b()Lcom/google/android/gms/internal/measurement/yc;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/yc;->c()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/xc;->b()Lcom/google/android/gms/internal/measurement/yc;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/measurement/yc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/xc;->n:Lcom/google/android/gms/internal/measurement/k7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/k7;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/yc;

    return-object v0
.end method
