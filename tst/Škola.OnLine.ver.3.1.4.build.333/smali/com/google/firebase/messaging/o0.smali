.class public final Lcom/google/firebase/messaging/o0;
.super Lf4/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/messaging/o0$c;,
        Lcom/google/firebase/messaging/o0$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/firebase/messaging/o0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field n:Landroid/os/Bundle;

.field private o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lcom/google/firebase/messaging/o0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/messaging/p0;

    invoke-direct {v0}, Lcom/google/firebase/messaging/p0;-><init>()V

    sput-object v0, Lcom/google/firebase/messaging/o0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Lf4/a;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    return-void
.end method

.method private C(Ljava/lang/String;)I
    .locals 1

    const-string v0, "high"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const-string v0, "normal"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public D()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    const-string v1, "message_type"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public E()Lcom/google/firebase/messaging/o0$c;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->p:Lcom/google/firebase/messaging/o0$c;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    invoke-static {v0}, Lcom/google/firebase/messaging/j0;->t(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/firebase/messaging/o0$c;

    new-instance v1, Lcom/google/firebase/messaging/j0;

    iget-object v2, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    invoke-direct {v1, v2}, Lcom/google/firebase/messaging/j0;-><init>(Landroid/os/Bundle;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/messaging/o0$c;-><init>(Lcom/google/firebase/messaging/j0;Lcom/google/firebase/messaging/o0$a;)V

    iput-object v0, p0, Lcom/google/firebase/messaging/o0;->p:Lcom/google/firebase/messaging/o0$c;

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->p:Lcom/google/firebase/messaging/o0$c;

    return-object v0
.end method

.method public F()I
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    const-string v1, "google.original_priority"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    const-string v1, "google.priority"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-direct {p0, v0}, Lcom/google/firebase/messaging/o0;->C(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public G()J
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    const-string v1, "google.sent_time"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_1

    :try_start_0
    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid sent time: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FirebaseMessaging"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public H()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    const-string v1, "google.to"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public I()I
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    const-string v1, "google.ttl"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_1

    :try_start_0
    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid TTL: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FirebaseMessaging"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method J(Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    return-void
.end method

.method public k()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    const-string v1, "collapse_key"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->o:Ljava/util/Map;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    invoke-static {v0}, Lcom/google/firebase/messaging/d$a;->a(Landroid/os/Bundle;)Lo/a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/messaging/o0;->o:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->o:Ljava/util/Map;

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    const-string v1, "from"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/messaging/p0;->c(Lcom/google/firebase/messaging/o0;Landroid/os/Parcel;I)V

    return-void
.end method

.method public x()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    const-string v1, "google.message_id"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/messaging/o0;->n:Landroid/os/Bundle;

    const-string v1, "message_id"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
