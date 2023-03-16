.class public final Lcom/google/android/gms/internal/measurement/uc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/k7;


# static fields
.field private static final o:Lcom/google/android/gms/internal/measurement/uc;


# instance fields
.field private final n:Lcom/google/android/gms/internal/measurement/k7;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/uc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/uc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/uc;->o:Lcom/google/android/gms/internal/measurement/uc;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/wc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/wc;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/o7;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/k7;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/o7;->a(Lcom/google/android/gms/internal/measurement/k7;)Lcom/google/android/gms/internal/measurement/k7;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/uc;->n:Lcom/google/android/gms/internal/measurement/k7;

    return-void
.end method

.method public static b()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/uc;->o:Lcom/google/android/gms/internal/measurement/uc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/uc;->c()Lcom/google/android/gms/internal/measurement/vc;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/vc;->a()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/uc;->c()Lcom/google/android/gms/internal/measurement/vc;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/measurement/vc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/uc;->n:Lcom/google/android/gms/internal/measurement/k7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/k7;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/vc;

    return-object v0
.end method
