.class abstract Lcom/google/android/gms/internal/measurement/ca;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lcom/google/android/gms/internal/measurement/ca;

.field private static final b:Lcom/google/android/gms/internal/measurement/ca;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/x9;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/x9;-><init>(Lcom/google/android/gms/internal/measurement/w9;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/ca;->a:Lcom/google/android/gms/internal/measurement/ca;

    new-instance v0, Lcom/google/android/gms/internal/measurement/z9;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/z9;-><init>(Lcom/google/android/gms/internal/measurement/y9;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/ca;->b:Lcom/google/android/gms/internal/measurement/ca;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/aa;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static c()Lcom/google/android/gms/internal/measurement/ca;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/ca;->a:Lcom/google/android/gms/internal/measurement/ca;

    return-object v0
.end method

.method static d()Lcom/google/android/gms/internal/measurement/ca;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/ca;->b:Lcom/google/android/gms/internal/measurement/ca;

    return-object v0
.end method


# virtual methods
.method abstract a(Ljava/lang/Object;J)V
.end method

.method abstract b(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
