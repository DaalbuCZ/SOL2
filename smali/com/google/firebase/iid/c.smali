.class final synthetic Lcom/google/firebase/iid/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/a;


# instance fields
.field private final a:Lcom/google/firebase/iid/FirebaseInstanceId;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/c;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    iput-object p2, p0, Lcom/google/firebase/iid/c;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/iid/c;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lt4/i;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/iid/c;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-object v1, p0, Lcom/google/firebase/iid/c;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/iid/c;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/firebase/iid/FirebaseInstanceId;->z(Ljava/lang/String;Ljava/lang/String;Lt4/i;)Lt4/i;

    move-result-object p1

    return-object p1
.end method