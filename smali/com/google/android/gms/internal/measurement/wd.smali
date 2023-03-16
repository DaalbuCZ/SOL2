.class public final Lcom/google/android/gms/internal/measurement/wd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/k7;


# static fields
.field private static final o:Lcom/google/android/gms/internal/measurement/wd;


# instance fields
.field private final n:Lcom/google/android/gms/internal/measurement/k7;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/wd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/wd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/wd;->o:Lcom/google/android/gms/internal/measurement/wd;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/yd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/yd;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/o7;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/k7;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/o7;->a(Lcom/google/android/gms/internal/measurement/k7;)Lcom/google/android/gms/internal/measurement/k7;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/wd;->n:Lcom/google/android/gms/internal/measurement/k7;

    return-void
.end method

.method public static b()D
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/wd;->o:Lcom/google/android/gms/internal/measurement/wd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/wd;->e()Lcom/google/android/gms/internal/measurement/xd;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/xd;->a()D

    move-result-wide v0

    return-wide v0
.end method

.method public static c()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/wd;->o:Lcom/google/android/gms/internal/measurement/wd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/wd;->e()Lcom/google/android/gms/internal/measurement/xd;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/xd;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public static d()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/wd;->o:Lcom/google/android/gms/internal/measurement/wd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/wd;->e()Lcom/google/android/gms/internal/measurement/xd;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/xd;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public static f()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/wd;->o:Lcom/google/android/gms/internal/measurement/wd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/wd;->e()Lcom/google/android/gms/internal/measurement/xd;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/xd;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static g()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/wd;->o:Lcom/google/android/gms/internal/measurement/wd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/wd;->e()Lcom/google/android/gms/internal/measurement/xd;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/xd;->e()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/wd;->e()Lcom/google/android/gms/internal/measurement/xd;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/google/android/gms/internal/measurement/xd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/wd;->n:Lcom/google/android/gms/internal/measurement/k7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/k7;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/xd;

    return-object v0
.end method
