.class public final Lcom/google/android/gms/internal/measurement/ge;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/k7;


# static fields
.field private static final o:Lcom/google/android/gms/internal/measurement/ge;


# instance fields
.field private final n:Lcom/google/android/gms/internal/measurement/k7;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/ge;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/ge;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/ge;->o:Lcom/google/android/gms/internal/measurement/ge;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/ie;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/ie;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/o7;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/k7;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/o7;->a(Lcom/google/android/gms/internal/measurement/k7;)Lcom/google/android/gms/internal/measurement/k7;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/ge;->n:Lcom/google/android/gms/internal/measurement/k7;

    return-void
.end method

.method public static c()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/ge;->o:Lcom/google/android/gms/internal/measurement/ge;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/ge;->b()Lcom/google/android/gms/internal/measurement/he;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/he;->a()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static d()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/ge;->o:Lcom/google/android/gms/internal/measurement/ge;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/ge;->b()Lcom/google/android/gms/internal/measurement/he;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/he;->b()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/ge;->b()Lcom/google/android/gms/internal/measurement/he;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/measurement/he;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ge;->n:Lcom/google/android/gms/internal/measurement/k7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/k7;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/he;

    return-object v0
.end method
